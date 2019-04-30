let employee = {
    firstName: "jack",
    lastName : "something",
    fullName : function(){
        return this.firstName + ' ' + this.lastName;
    }
};

let getFullname = employee.fullName();
console.log(getFullname);

