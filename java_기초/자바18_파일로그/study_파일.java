package �ڹ�18_���Ϸα�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class study_���� {

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
			System.out.println("����������׽�Ʈ");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:");
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
				System.out.println("���α׷�����"); break;
			}
		}		
	}
	void input()
	{
		System.out.println("�̸�:"); name = sc.next();
		System.out.println("����:"); age = sc.next();
		System.out.println("�ּ�:"); add = sc.next();
		System.out.println("����ó:"); number = sc.next();
		
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\data0711.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
                //����
            	bufferedWriter.write("�̸�:"+name+"/����:"+age+"/�ּ�:"+add+"/����ó:"+number);
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
            System.out.println(i+1+"��"+line);
            i++;
        }                 
        bufReader.close();
    }catch (FileNotFoundException e) {           
    }catch(IOException e){           
    }
	}
}



