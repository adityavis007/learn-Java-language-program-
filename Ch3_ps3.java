public class Ch3_ps3 {
    public void main (String[] args){
        
// 1st Quuestion to answer        
        String name = "Aditya Vishwakarma";
        name = name.toLowerCase();
        System.out.println(name);

// 2nd Quuestion to answer 
        String name2 ="to Lower Case";
        name2 =name2.replace(" ", "_");
        System.out.println(name2);
        
// 3rd Quuestion to answer 
        String letter = "Dear <|name|>, Thanks a lot.";
        letter = letter.replace("<|name|>", "Aditya");
        System.out.println(letter);

// 4th Quuestion to answer  
        String myDetect = "This is a    my  detect.";
        System.out.println(myDetect.indexOf("  "));
        System.out.println(myDetect.indexOf("   "));         
        
// 5th Quuestion to answer     
        String Secondletter = "Dear Aditya, \n \t This java coures is nice. \n Thanks!";
        System.out.println(Secondletter);
    }
}
