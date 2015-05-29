package heranca;

class Alpha {
    String getType() { return "alpha"; }
}
class Beta extends Alpha {
    String getType() { return "beta"; }
}



//What is the result? 
//A) alpha beta
//B) beta beta
//C) gamma gamma
//D) alpha alpha
//E) Compilation fails.
