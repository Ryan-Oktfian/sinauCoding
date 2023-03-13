public class loop {

    public static void main(String[] args) {
    
    // "for" looping
    int nilai;
    for (nilai = 1; nilai<=10; nilai++){
        System.out.println(nilai);
    }

    // "while" looping
    int nilai1 = 1;
    while(nilai1<=10){
    System.out.println(nilai1);
    nilai1++;
    }

    // "do while" looping
    int nilai2=1;
    do {
    System.out.println(nilai2);
    nilai2++;
    }  while (nilai2<=10);

    // break-continue
    int nilai3;
    System.out.println("pernyataan break batas 10");
        for(nilai3 = 1;nilai3<=10;nilai3++){
            if(nilai == 5)
                break;
            else
            System.out.println(nilai3);

        }
        System.out.println();

        System.out.println("pernyataan continue batas 10");
        for(nilai3 = 1; nilai3<=10; nilai3++){
            if(nilai3==5)
                continue;
            else
            System.out.println(nilai);

        }


    }
    
}
