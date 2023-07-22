class Triangle {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        int weight = Integer.parseInt(args[1]);
        int area;

        area = (int)(height * weight / 2);

        System.out.println("高さ: " + height);
        System.out.println("幅: " + weight);
        System.out.println("面積: " + area);
    }
}
