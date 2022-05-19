public class Labyrinth {
    public static void main(String[] args) {
        // 1. 创建迷宫
        /*
         * 0 表示没有障碍物
         * 1 表示有障碍物
         *
         * 1 1 1 1 1 1 1
         * 1 0 0 0 0 0 1
         * 1 0 0 0 0 0 1
         * 1 1 1 0 0 0 1
         * 1 0 0 0 0 0 1
         * 1 0 0 0 0 0 1
         * 1 0 0 0 0 0 1
         * 1 1 1 1 1 1 1
         * */
        int[][] map = new int[8][7];
        // 最上面和最下面的一行，全部设置为 1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 将最右边的列和最左边的列设置为 1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        // 设置特殊障碍物
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("====当前地图====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
        LabyrinthResolver labyrinthResolver = new LabyrinthResolver();
        labyrinthResolver.findWay(map, 1, 1);
        System.out.println("找路的情况如下：");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

class LabyrinthResolver {
    /**
     * 找出迷宫的路径（终点是 6,5 地图的右下角）
     * 0 表示是正常的路，1 表示障碍物，2 表示可以走，3 表示走过，但是走不通，是死路
     * 当 6，5 变成 2 的时候，则表示走到了终点，递归结束
     * 规定老鼠找路策略：下 -> 右 -> 上 -> 左
     *
     * @param map 地图
     * @param i   x 坐标
     * @param j   y 坐标
     * @return 返回是否找到路径
     */
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        }
        if (map[i][j] == 0) {
            // 假定当前位置是可以走通的
            map[i][j] = 2;
            if (findWay(map, i + 1, j)) {
                return true;
            } else if (findWay(map, i, j + 1)) {
                return true;
            } else if (findWay(map, i - 1, j)) {
                return true;
            } else if (findWay(map, i, j - 1)) {
                return true;
            } else {
                map[i][j] = 3;
                return false;
            }
        }
        return false;
    }
}