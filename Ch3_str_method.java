public class Ch3_str_method {
    
    public void main(String[] args){
        String name = "Aditya";
        
        // 1st Method
        System.out.println(name.length());

        // 2nd Method
        System.out.println(name.toLowerCase());

        // 3rd Method
        System.out.println(name.toUpperCase());

        // 4th Method
        System.out.println(name.trim());

        // 5th Method
        System.out.println(name.substring(4));

        // Six Method
        System.out.println(name.substring(2,5));

        // 7th Method
        System.out.println(name.replace('d', 'R'));

        // 8th Method
        System.out.println(name.startsWith("Ad"));

        // 9th Method
        System.out.println(name.endsWith("ya"));

        // 10th Method
        System.out.println(name.charAt(5));

        // 11th Method
        System.out.println(name.indexOf("f"));

        // 12th Method
        System.out.println(name.indexOf("i", 2));

        // 13th Method
        System.out.println(name.lastIndexOf("t"));

        // 14th Method
        System.out.println(name.lastIndexOf("y", 5));

        // 15th Method
        System.out.println(name.equals("Aditya"));

        // 16th Method
        System.out.println(name.equalsIgnoreCase("adiTYa"));

    }

    
}
