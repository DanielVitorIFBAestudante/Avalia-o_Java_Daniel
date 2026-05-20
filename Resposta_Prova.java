
void main() {
    int contardia = 0;
    int consumo = 0;
    int totalconsumo= 0;
    int media = 0;
    consumo = Integer.parseInt(IO.readln("Consumo do dia:"));
    while (consumo !=0){
        contardia = (contardia+1);
        totalconsumo = (totalconsumo + consumo);
        consumo = Integer.parseInt(IO.readln("Consumo do dia:"));
    }

    if(contardia>0){
        media = (totalconsumo/contardia);
        if (media<100)
            System.out.printf(media + "Consumo sustetavel");
        if ((media>=100) && (media<175))
            System.out.printf(media + "Consumo moderado");
        if (media>175)
            System.out.printf(media + "Consumo excessivo");
    }
    else
    System.out.printf("Não há consumo");    
}
