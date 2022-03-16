package OOPReview;

public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    
    public Line(int x1, int y1, int x2, int y2){
        this.setBegin(new Point(x1, y1));
        this.setEnd(new Point(x2, y2));
    }
    
    public void setBegin(Point begin){
        this.begin = begin;
    }
    public Point getBegin(){
        return this.begin;
    }
    
    public void setEnd(Point end){
        this.end = end;
    }
    public Point getEnd(){
        return this.end;
    }
    
    public double getLength(){
        return Math.pow((Math.pow((this.getEnd().getY() - this.getBegin().getY()), 2) + Math.pow((this.getEnd().getX() - this.getBegin().getX()),2)), 0.5);
    }
    
//    private class Point {
//        private int x;
//        private int y;
//        public Point(int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//        
//        public void setX(int x){
//            this.x = x;
//        }
//        public int getX(){
//            return this.x;
//        }
//        
//        public void setY(int y){
//            this.y = y;
//        }
//        public int getY(){
//            return this.y;
//        }
//    }
}
