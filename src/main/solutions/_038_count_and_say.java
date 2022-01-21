class _038_count_and_say {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String last = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();
        int pos = 0;
        int count = 0;
        for (int i = 0; i < last.length(); i++) {
            if (last.charAt(pos) == last.charAt(i)) {
                count++;
            } else {
                res.append(count);
                res.append(last.charAt(pos));
                count = 1;
            }
            pos = i;
            if (i == last.length() - 1) {
                res.append(count);
                res.append(last.charAt(pos));
            }
        }
        return res.toString();
    }
}
