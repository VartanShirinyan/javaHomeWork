package HomeWork2;
/*Task_2
РќР° РїРµСЂРІРѕР№ СЃС‚СЂРѕРєРµ Р·Р°РїРёСЃС‹РІР°РµС‚СЃСЏ РЅР°С‚СѓСЂР°Р»СЊРЅРѕРµ С‡РёСЃР»Рѕ n - РєРѕР»РёС‡РµСЃС‚РІРѕ СЃС‚СЂРѕС‡РµРє РІ РєРЅРёРіРµ. 
Р—Р°С‚РµРј РІРІРѕРґРёС‚СЃСЏ n СЃС‚СЂРѕРє - СЃС‚СЂРѕРєРё РєРЅРёРіРё. РїРѕС‚РѕРј РІРІРѕРґРёС‚СЃСЏ РЅР°С‚СѓСЂР°Р»СЊРЅРѕРµ С‡РёСЃР»Рѕ m - РєРѕР»РёС‡РµСЃС‚РІРѕ РїСЂРѕРґСѓРєС‚РѕРІ, 
РЅР° РєРѕС‚РѕСЂС‹Рµ Сѓ С‡РµР»РѕРІРµРєР° Р°Р»Р»РµСЂРіРёСЏ. РџРѕС‚РѕРј РІРІРѕРґРёС‚СЃСЏ m СЃС‚СЂРѕРє - РІРёРґР° "РїСЂРѕРґСѓРєС‚1 - РїСЂРѕРґСѓРєС‚2", 
РіРґРµ РїСЂРѕРґСѓРєС‚1 - РїСЂРѕРґСѓРєС‚, РЅР° РєРѕС‚РѕСЂС‹Р№ Сѓ С‡РµР»РѕРІРµРєР° Р°Р»Р»РµСЂРіРёСЏ Рё 
РїСЂРѕРґСѓРєС‚2 - РїСЂРѕРґСѓРєС‚, РЅР° РєРѕС‚РѕСЂС‹Р№ СЃР»РµРґСѓРµС‚ Р·Р°РјРµРЅРёС‚СЊ РїСЂРѕРґСѓРєС‚1. 
Р“Р°СЂР°РЅС‚РёСЂСѓРµС‚СЃСЏ С‡С‚Рѕ Р»СЋР±РѕР№ РїСЂРѕРґСѓРєС‚ СЃРѕСЃС‚РѕРёС‚ РёР· 1 СЃР»РѕРІР°. РЅР°Р·РІР°РЅРёРµ РїСЂРѕРґСѓРєС‚РѕРІ РЅР°РїРёСЃР°РЅС‹ СЃС‚СЂРѕС‡РЅС‹РјРё Р±СѓРєРІР°РјРё. 
Р“Р°СЂР°РЅС‚РёСЂСѓРµС‚СЃСЏ, С‡С‚Рѕ РїСЂРѕРґСѓРєС‚С‹, РЅР° РєРѕС‚РѕСЂС‹Рµ РЅСѓР¶РЅРѕ РІС‹РїРѕР»РЅРёС‚СЊ Р·Р°РјРµРЅСѓ, РЅРµ РІСЃС‚СЂРµС‡Р°СЋС‚СЃСЏ РёР·РЅР°С‡Р°Р»СЊРЅРѕ РІ С‚РµРєСЃС‚Рµ.
Р’С‹С…РѕРґРЅС‹Рµ РґР°РЅРЅС‹Рµ
Р—Р°РјРµРЅРёС‚Рµ РІСЃРµ РїСЂРѕРґСѓРєС‚С‹ РІ РїРѕРІР°СЂРµРЅРЅРѕР№ РєРЅРёРіРµ Р’Р°СЃРё Рё РІС‹РІРµРґРёС‚Рµ РёС… РїРѕСЃС‚СЂРѕС‡РЅРѕ РЅР° СЌРєСЂР°РЅ. 
РќР° РѕРєРѕРЅС‡Р°РЅРёСЏ РЅРµ РѕР±СЂР°С‰Р°Р№С‚Рµ РІРЅРёРјР°РЅРёРµ. Р’РђР–РќРћ!!! 
Р•СЃР»Рё РїСЂРѕРґСѓРєС‚, РєРѕС‚РѕСЂС‹Р№ СЃР»РµРґСѓРµС‚ Р·Р°РјРµРЅРёС‚СЊ РЅР°РїРёСЃР°РЅ СЃ Р±РѕР»СЊС€РѕР№ Р±СѓРєРІС‹, С‚Рѕ Рё Р·Р°РјРµРЅР° С‚РѕР¶Рµ РґРѕР»Р¶РЅР° РЅР°С‡РёРЅР°С‚СЊСЃСЏ СЃ Р±РѕР»СЊС€РѕР№ Р±СѓРєРІС‹!
Sample Input:
2
Р РµС†РµРїС‚ 1. РђСЂР°С…РёСЃ 100РіСЂ, РјРѕСЂРѕР¶РµРЅРѕРµ 200РіСЂ. Р’РѕР·СЊРјРёС‚Рµ Р°СЂР°С…РёСЃ Рё РёР·РјРµР»С‡РёС‚Рµ РµРіРѕ. РџРѕСЃС‹РїСЊС‚Рµ РёР·РјРµР»СЊС‡С‘РЅРЅС‹Р№ Р°СЂР°С…РёСЃ РЅР° РјРѕСЂРѕР¶РµРЅРѕРµ.
Р РµС†РµРїС‚ 2. РљР»СѓР±РЅРёРєР° 100РіСЂ, СЃРіСѓС‰РµРЅРєР° 3РєРі. РЎРјРµС€Р°С‚СЊ, РµСЃС‚СЊ) Р Р°РґРѕРІР°С‚СЊСЃСЏ Р¶РёР·РЅРё.
3
Р°СЂР°С…РёСЃ - РєРѕР»Р±Р°СЃР°
РєР»СѓР±РЅРёРєР° - РІРёС€РЅСЏ
СЃРіСѓС‰РµРЅРєР° - РјРѕР»РѕРєРѕ
Sample Output:
Р РµС†РµРїС‚ 1. РљРѕР»Р±Р°СЃР° 100РіСЂ, РјРѕСЂРѕР¶РµРЅРѕРµ 200РіСЂ. Р’РѕР·СЊРјРёС‚Рµ РєРѕР»Р±Р°СЃР° Рё РёР·РјРµР»С‡РёС‚Рµ РµРіРѕ. РџРѕСЃС‹РїСЊС‚Рµ РёР·РјРµР»СЊС‡С‘РЅРЅС‹Р№ РєРѕР»Р±Р°СЃР° РЅР° РјРѕСЂРѕР¶РµРЅРѕРµ.
Р РµС†РµРїС‚ 2. Р’РёС€РЅСЏ 100РіСЂ, РјРѕР»РѕРєРѕ 3РєРі. РЎРјРµС€Р°С‚СЊ, РµСЃС‚СЊ) Р Р°РґРѕРІР°С‚СЊСЃСЏ Р¶РёР·РЅРё.
 */
import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Р’РІРµРґРёС‚Рµ РєРѕР»РёС‡РµСЃС‚РІРѕ СЃС‚СЂРѕРє РІ РєРЅРёРіРµ:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] book = new String[n];
        System.out.println("Р’РІРµРґРёС‚Рµ СЃС‚СЂРѕРєРё РєРЅРёРіРё:");
        for (int i = 0; i < n; i++) {
            book[i] = sc.nextLine();
        }

        System.out.println("Р’РІРµРґРёС‚Рµ РєРѕР»РёС‡РµСЃС‚РІРѕ Р·Р°РјРµРЅ:");
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, String> replacements = new HashMap<>();
        System.out.println("Р’РІРµРґРёС‚Рµ Р·Р°РјРµРЅС‹ РІ С„РѕСЂРјР°С‚Рµ 'СЃР»РѕРІРѕ - Р·Р°РјРµРЅР°':");
        for (int i = 0; i < m; i++) {
            String[] line = sc.nextLine().split(" - ");
            replacements.put(line[0], line[1]);
        }

        for (int i = 0; i < n; i++) {
            String[] words = book[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                String word = words[j].toLowerCase();
                if (replacements.containsKey(word)) {
                    String replacement = replacements.get(word);
                    if (Character.isUpperCase(words[j].charAt(0))) {
                        replacement = capitalize(replacement);
                    }
                    words[j] = replacement;
                }
            }
            System.out.println(String.join(" ", words));
        }
    }

    private static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
