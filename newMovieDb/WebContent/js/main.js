const api = 'https://api.themoviedb.org/3/search/movie';
const apiKey = 'eb862ab2ce450a481770834414f92c02';
const apiImageUrl = 'https://image.tmdb.org/t/p/w200';

// ready method is depreciated and might not available on future jquery version
// $(document).ready(function(){
//
// });

// using new jquery method
jQuery(function ($) {
  // rule of thumb. When I'm not sure what to use: let or const, always use const
  const error = $('#error');
  const searchBtn = $('#search_btn');
  const searchInput = $('#search_input');
  const listContainer = $('#list_container');

  // Binding click event to searchBtn
  searchBtn.on('click', () => {
    const searchText = searchInput.val(); // getting input value from input form. Calling jquery val() function on input.
    if (searchText === '') {
      error.text('Search Box Is Empty'); // By Default, #error div is empty. Inserting text to it.
      error.show(300); // By Default #error element is hidden. Showing it by calling jQuery .show() function
    } else if (searchText.length < 3) {
      error.text('Please Provide at least 3 letters'); // insert text to #error
      error.show(300); // showing #error
    } else {
      // userinput is valid
      // time to make a fetch request to API and get JSON data.

      // defining query string as obj
      const movieApiSettings = {
        query: searchText,
        api_key: apiKey
      };

      // for(let x = 0; x < 10000000000000000000000; i++){
      //   // suppose that it took 10min to complete
      //   // this will block browser/user
      // }

      // using jQuery.getJSON() function to make external request (ajax) to get data.
      // $.ajax()
      // $.get()
      // and other return promise.
      $.getJSON(api, movieApiSettings)
        .then((res) => {
          // We got The List of Movies
          // Time to print movie list on page..
          // Step: 1, remove old result's if any
          listContainer.empty();
          // creating New Element
          let ul = $('<ul/>');
          // looping through all the movie items
          res.results.forEach((movie) => {
            // creating new list element
            let li = $('<li/>');

            const imgContainer = $('<div/>');
            const imageElement = $('<img/>');
            imageElement.attr('width', 150);
            imageElement.attr('height', 150);
            imageElement.attr('src', apiImageUrl + movie.poster_path);// setting attribute to image element
            imgContainer.append(imageElement);
            li.append(imgContainer);

            const detailsContainer = $('<div/>');
            const detailsLink = $('<a/>');
            detailsLink.attr('target', '_blank');
            detailsLink.attr('href', './movie_details.html?movieId=' + movie.id);
            detailsLink.text(movie.title);
            detailsContainer.append(detailsLink);
            const detailsReleaseDate = $('<h5/>');
            detailsReleaseDate.text('Release Date: ' + movie.release_date);
            detailsReleaseDate.css('font-style', 'italic'); // Adding style to element using element.css() method
            detailsContainer.append(detailsReleaseDate);
            const detailesOverview = $('<p/>');
            detailesOverview.text(movie.overview.slice(0, 300) + ' ... ');
            detailsContainer.append(detailesOverview);
            li.append(detailsContainer); // appending to list

            const ratingContainer = $('<div/>');
            const ratingH5 = $('<h5/>');
            ratingH5.text('Rating (' + movie.vote_average + ')');
            ratingContainer.append(ratingH5);
            const ratingProgress = $('<progress/>');
            ratingProgress.attr('max', '100'); // setting attribute to image element
            ratingProgress.attr('value', movie.vote_average * 10);
            ratingContainer.append(ratingProgress);
            li.append(ratingContainer); // appending to list

            ul.append(li); // appending newly created list to UL
          });
          console.log(ul);
          listContainer.append(ul); // appending current UL element item to #listContainer
        })
        .catch(err => {
          console.log(err);
        })

      /*
        JS promise blue print
        promise
          .then()
          .then()
          .then()
          .catch()
          .catch()
          .finally(); // clean up resource
       */
    }
  });

  // Event binding on #searchInput
  searchInput.on('input', () => {
    error.hide(300); // hiding #error when user input anything on #searchInput.
  });

  $(document).on('keypress', (evt) => {
    if (evt.which === 13) {
      searchBtn.trigger('click');
    }
  });
});


// Promise... most of the important concept on javascript world.
// I need to read more about "Promise"