class inheritance{
    static void varArgs(String ... var_name){
        for (String item : var_name) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        varArgs("Hello","Aditya","welcome","to","a","new","concept");
    }
}