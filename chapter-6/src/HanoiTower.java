public class HanoiTower {
    public static void main(String[] args) {
        HanoiTowerResolver hanoiTowerResolver = new HanoiTowerResolver();
        hanoiTowerResolver.move(1, 'A', 'B', 'C');
        System.out.println("");
        hanoiTowerResolver.move(2, 'A', 'B', 'C');
        System.out.println("");
        hanoiTowerResolver.move(3, 'A', 'B', 'C');
        System.out.println("");

    }
}

class HanoiTowerResolver {
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            // 把所有盘看成最底下一块盘，和上面的所有盘
            // 需要先把上面的所有盘移动到 b (借助 c)
            // 再把最下面的盘移动到 c
            move(num - 1, a, c, b);
            move(1, a, b, c);
            move(num - 1, b, a, c);
        }
    }
}