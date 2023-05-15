package HomeWork2;
    /*Task_0
public class Task_0 {
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {
}
public String Jewelry Search(String jewels, String stones) {
return "";
}
}

*/
public class Task_0 {

    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = JewelrySearch(jewels, stones);
        System.out.println(result);
    }
    
    public static String JewelrySearch(String jewels, String stones) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
            result.append(jewels.charAt(i)).append(count);
            count = 0;
        }
        return result.toString();
    }
}


