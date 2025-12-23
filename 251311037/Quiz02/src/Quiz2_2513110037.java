public class Quiz2_2513110037 {
    public static boolean has_letter(String password){

        for(int i=0; i<password.length();i++){

            if(Character.isLetter(password.charAt(i))){

                return true;

            }

        }

        return false;

    } public static boolean has_special_letter(String password){

        for(int i=0; i<password.length();i++){

            if(Character.isDigit(password.charAt(i))){

                return true;

            }

        }

        return false;

    } public static boolean has_whitespace(String password){



            if(password.isEmpty()){ return true;}

            return false;





    }public static String create_blind_password(String password){



        for(int i=0; i<password.length();i++){

           if(password.charAt(i)>0 || password.charAt(i)<password.length()){

               password.replace(password.charAt(i),*);


           }

        }


        return password;


    }
}
