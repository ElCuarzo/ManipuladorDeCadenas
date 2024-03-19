public class ManipuladorDeCadenasTest {
    public static void main(String[] args) {
        ManipulacionDeCadenas iD = new ManipulacionDeCadenas();
        String str = iD.trimAndConcat("  Hola    ", "    Mundo   ");
        System.out.println(str);

        ManipulacionDeCadenas manipulator = new ManipulacionDeCadenas();
        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

        ManipulacionDeCadenas uwu = new ManipulacionDeCadenas();
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int d = uwu.getIndexOrNullV2(word, subString);
        int e = uwu.getIndexOrNullV2(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // -1

        ManipulacionDeCadenas ewe = new ManipulacionDeCadenas();
        String worldV3 = ewe.concatSubStringV2("Hola", 1, 3, "mundo");
        System.out.println(worldV3);
    }
}