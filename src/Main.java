void main(String[] args) {

/*
    int a = 3;
    int b = 1;

    while (b<=10){
        System.out.println(a + "*" + b + "=" + a*b);
        b++;
    }

*/ //Task 1

/*
    String sentence = "My dyslexia paired with mathematician's  \"talent\"  makes learning curve very \"EASY\"";
    System.out.println(sentence.length());
    String result = (sentence.length() % 2 == 0) ? " even" : " odd";
    System.out.println(result);
*/ //Task 2

/*
    int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (int i = 0; i < numbers.length;i++){

        if (i == 5) continue;

        System.out.println(numbers[i]);
    }

*/ //Task 3

/*    Scanner scanner = new Scanner(System.in);
    System.out.println("Feel free to enter any sentence/word");
    String sentence = scanner.nextLine(); // ნასწავლი next() შევცვალე nextLine()-ით ვინაიდან თურმე next ი პირველივე სფეისზე აჩერებდა სკანერს.
    sentence = sentence.toLowerCase();
    int sum = 0;
    char [] vowels = {'a', 'e', 'i', 'o', 'u'};


    for (int i = 0; i < sentence.length(); i++) {

        for (int j = 0; j < vowels.length; j++) {

            if (vowels[j] == sentence.charAt(i)){
                sum++;
                break;

            }

        }
    }
    System.out.println("amount of vowels is " + sum);

*/ //Task 4

/*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Feel free to enter any sentence/word");
    String sentence = scanner.nextLine();
    sentence = sentence.toLowerCase();
    char [] vowels = {'a', 'e', 'i', 'o', 'u'};
    int sum = 0;
    int i = 0;
    int j = 0;
    boolean vowelsChecker;


    while (i < sentence.length()) {
        vowelsChecker = true;
        while(j < vowels.length) {
            if(vowels[j] == sentence.charAt(i)) {
                vowelsChecker = false;
                break;
            }
            j++;
        }

        if(Character.isLetter(sentence.charAt(i)) && vowelsChecker) {
            sum++;
        }

        j = 0;
        i++;
    }

    System.out.println("Amount of consonants is " + sum);

*/ //Task 5

}