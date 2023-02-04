package Replit;

public class Main {

        String censorLetter(String str,char ch){
            String newStr="";
            newStr=str.replace(ch,'*');
            System.out.println(newStr);
            return newStr;

        }

        public static void main(String[] args) {
        Main obj=new Main();
      obj.censorLetter("computer science",'e');
      obj.censorLetter("trick or treat",'t');

    }

}


