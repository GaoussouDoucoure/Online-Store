class Product{
        private String sku;
        private String productName;
        private double price;
        private String department;

        //constructor
        public Product(String sku, String name, double price, String department){
            this.sku=sku;
            this.productName=name;
            this.price=price;
            this.department=department;
        }
        //getter to access pvt variables
        public String getSku(){
            return this.sku;
        }
        public String getName(){
            return this.productName;
        }
        public double getPrice(){
            return this.price;
        }
        public String getDepartment(){
            return this.department;
        }
        //display format
        // Override toString() for readable output
        @Override
        public String toString() {
            return "SKU: " + sku + ", Product: " + productName + ", Price: $" + price + ", Department: " + department;
        }

}

