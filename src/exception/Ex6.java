package exception;

class Ex6{
    public static void main(String args[]){
        int x = 0, y=10;          
        try{
            y /= x;
            System.out.print("/ by 0");
        }   catch(Exception e){
            System.out.print("error");
        }
    } 
} 


//A. 0 
//B. error
//C. Compilation fails 
//D. An uncaught exception is thrown at runtime.
//E. No output