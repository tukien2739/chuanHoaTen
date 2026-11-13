public static String chuanHoaTen(String s) {
    if (s == null) return "";
    String[] words = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
    for (String w : words) {
        if (!w.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1).toLowerCase());
        }
    }
    return sb.toString();
}