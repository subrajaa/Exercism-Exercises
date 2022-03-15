import java.util.*;

class PythagoreanTriplet {

    private int a;
    private int b;
    private int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = c;
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof PythagoreanTriplet)) {
            return false;
        }
        PythagoreanTriplet temp = (PythagoreanTriplet) obj;
        return this.a == temp.a && this.b == temp.b && this.c == temp.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public static PythagoreanTripletCondition makeTripletsList() {
        return new PythagoreanTripletCondition();
    }

    public static class PythagoreanTripletCondition {
        private int factorsLessThanOrEqualTo;
        private int sumTo;

        public PythagoreanTripletCondition withFactorsLessThanOrEqualTo(int factor) {
            this.factorsLessThanOrEqualTo = factor;
            return this;
        }

        public PythagoreanTripletCondition thatSumTo(int sum) {
            this.sumTo = sum;
            return this;
        }

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> pythoTriplets = new ArrayList<>();
            int a, b, c;
            for(a = 1 ; a < factorsLessThanOrEqualTo ; a++) {
                for(b = a + 1 ; b < factorsLessThanOrEqualTo ; b++) {
                    c = sumTo - b - a;
                    if(c < a || c < b) {
                        break;
                    }
                    if(a*a + b*b == c*c) {
                        pythoTriplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            return pythoTriplets;
        }
    }
} 