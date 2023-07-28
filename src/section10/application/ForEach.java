package section10.application;

public class ForEach {

    public static void main(String[] args) {

        String[] nome = new String[] {"maria", "jose", "paulo"};

        for(int i=0; i<nome.length; i++){
            System.out.println(nome[i]);
        }

        for(String obj : nome){
            System.out.println(obj);
        }
    }
}
