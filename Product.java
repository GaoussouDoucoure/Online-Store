class Product{
        private String sku;
        private String name;
        private double price;
        private String department;

        //constructor
        public Product(String sku, String name, double price, String department){
            this.sku=sku;
            this.name=name;
            this.price=price;
            this.department=department;
        }
        //getter to access pvt variables
        public String getSku(){
            return this.sku;
        }
        public String getName(){
            return this.name;
        }
        public double getPrice(){
            return this.price;
        }
        public String getDepartment(){
            return this.department;
        }
        //display format
        public String toString() {
            return String.format("%s | %s | $%.2f | %s",sku,name,price,department);
        }
}

