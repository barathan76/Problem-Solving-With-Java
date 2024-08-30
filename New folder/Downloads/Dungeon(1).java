public static String minStepsToGoldWithAllElements(int rows, int cols, Point adventurer, Point monster, Point trigger, Point gold, List<Point> pits) {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visitedA = new boolean[rows + 1][cols + 1];
    boolean[][] visitedM = new boolean[rows + 1][cols + 1];
    Set<Point> pitSet = new HashSet<>(pits);
    Queue<Point> queueA = new LinkedList<>();
    Queue<Point> queueM = new LinkedList<>();
    Map<Point, Point> parentA = new HashMap<>();
    
    queueA.add(new Point(adventurer.x, adventurer.y, 0));
    queueM.add(new Point(monster.x, monster.y, 0));
    visitedA[adventurer.x][adventurer.y] = true;
    visitedM[monster.x][monster.y] = true;
    parentA.put(adventurer, null);
    
    boolean monsterAlive = true;
    
    while (!queueA.isEmpty()) {
        Point currentA = queueA.poll();
        
        if (currentA.x == gold.x && currentA.y == gold.y && !monsterAlive) {
            List<Point> path = new ArrayList<>();
            for (Point at = currentA; at != null; at = parentA.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum number of steps: ").append(currentA.steps).append("\nPath: ");
            for (Point p : path) {
                sb.append("(").append(p.x).append(",").append(p.y).append(") -> ");
            }
            sb.setLength(sb.length() - 4);
            return sb.toString();
        }
        
        if (monsterAlive && !queueM.isEmpty()) {
            Point currentM = queueM.poll();
            for (int[] direction : directions) {
                int nxM = currentM.x + direction[0];
                int nyM = currentM.y + direction[1];
                
                if (nxM > 0 && nxM <= rows && nyM > 0 && nyM <= cols && !visitedM[nxM][nyM]) {
                    visitedM[nxM][nyM] = true;
                    queueM.add(new Point(nxM, nyM, currentM.steps + 1));
                }
            }
        }
        
        for (int[] direction : directions) {
            int nxA = currentA.x + direction[0];
            int nyA = currentA.y + direction[1];
            Point nextA = new Point(nxA, nyA, currentA.steps + 1);
            
            if (nxA > 0 && nxA <= rows && nyA > 0 && nyA <= cols && !visitedA[nxA][nyA] && (!monsterAlive || !visitedM[nxA][nyA]) && !pitSet.contains(nextA)) {
                visitedA[nxA][nyA] = true;
                queueA.add(nextA);
                parentA.put(nextA, currentA);
                if (nxA == trigger.x && nyA == trigger.y) {
                    monsterAlive = false;
                    queueM.clear();
                }
            }
        }
    }
    return "No possible solution";
}

public static void main(String[] args) {
    int rows = 5, cols = 4;
    Point adventurer = new Point(4, 1, 0);
    Point monster = new Point(1, 1, 0);
    Point trigger = new Point(4, 4, 0);
    Point gold = new Point(1, 3, 0);
    List<Point> pits = Arrays.asList(new Point(2, 1, 0), new Point(4, 2, 0), new Point(4, 3, 0));
    
    String result = minStepsToGoldWithAllElements(rows, cols, adventurer, monster, trigger, gold, pits);
    System.out.println(result);  // Output: Minimum number of steps: 9
}