package 자바18_파일로그;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class study_파일 {

	public static void main(String[] args) {
		Fil f = new Fil();
	}
}		
class Fil{
	Scanner sc = new Scanner(System.in);
	String name, age, add, number;

	Fil()
	{
		while(true)
		{
			System.out.println("파일입출력테스트");
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.종료");
			System.out.print("선택:");
			int sel = sc.nextInt();
			if(sel==1) 
			{
				input();
			}
			else if(sel==2) 
			{
				output();
			}
			else if(sel==3) 
			{
				System.out.println("프로그램종료"); break;
			}
		}		
	}
	void input()
	{
		System.out.println("이름:"); name = sc.next();
		System.out.println("나이:"); age = sc.next();
		System.out.println("주소:"); add = sc.next();
		System.out.println("연락처:"); number = sc.next();
		
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\data0711.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
                //쓰기
            	bufferedWriter.write("이름:"+name+"/나이:"+age+"/주소:"+add+"/연락처:"+number);
                bufferedWriter.newLine();
                  
                bufferedWriter.close();
        }catch (IOException e) {
            System.out.println(e);
        }
	}	
	void output()	{
    try{
    	File file = new File("C:\\aaa\\work\\data0711.txt");     
        FileReader filereader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(filereader);
        String line = "";
        int i=0;
        while((line = bufReader.readLine()) != null){
            System.out.println(i+1+"번"+line);
            i++;
        }                 
        bufReader.close();
    }catch (FileNotFoundException e) {           
    }catch(IOException e){           
    }
	}
}



