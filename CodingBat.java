public class Map2 {

  
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> out = new HashMap();
        for (String s:strings) {
            if (!out.containsKey(s)) out.put(s, 0);
        }
        return out;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> out = new HashMap();
        for (String s:strings) {
            if (!out.containsKey(s)) out.put(s, s.length());
        }
        return out;
    }

    
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> out = new HashMap();
        for (String s:strings) {
            out.put(s.substring(0, 1), s.substring(s.length()-1));
        }
        return out;
    }

   
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> out = new HashMap();
        for (String s:strings) {
            if (out.containsKey(s)) {
                out.put(s, out.get(s)+1);
            } else {
                out.put(s, 1);
            }
        }
        return out;
    }
    
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> out = new HashMap();
        for (String s:strings) {
            if (out.containsKey(s.substring(0, 1))) {
                out.put(s.substring(0, 1), out.get(s.substring(0, 1)) + s);
            } else {
                out.put(s.substring(0, 1), s);
            }
        }
        return out;
    }

   
    public String wordAppend(String[] strings) {
        String out = "";
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            if (map.containsKey(s)) {
                int val = map.get(s) + 1;
                if (val % 2 == 0) out = out + s;
                map.put(s, val);
            } else {
                map.put(s, 1);
            }
        }
        return out;
    }

   
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> out = new HashMap<String, Boolean>();
        for (String s:strings) {
            if (out.containsKey(s) && !out.get(s)) out.put(s, true);
            if (!out.containsKey(s)) out.put(s, false);
        }
        return out;
    }

   
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

   
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                if (map.get(key) == -1) continue;
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}