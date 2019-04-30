package databaseRecord;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		File aFile = new File("sqlinsert.txt");
		FileWriter fw = new FileWriter(aFile, false);
		
		for(int  i = 0; i<=100; i++) {
			fw.write("insert into jpaEmployee values ("

			+ i

			+ ", \'firstName" + i + "\'"

			+ ", \'lastName" + i + "\'"

			+ ", \'5551212" + i + "\'"

			+ ");\n"

			);

			}

			fw.close();
		}

	}


