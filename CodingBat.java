public class Map2 {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> out = new HashMap();
        for (String s:strings) {
            if (!out.containsKey(s)) out.put(s, s.length());
        }
        return out;
    }
}
