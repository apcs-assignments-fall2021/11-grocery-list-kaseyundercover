public class GroceryList {
    private String[] arr;

    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        arr = new String[10];
    }

    // Adds an item to the grocery list
    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == null) {
                arr[0] = item;
                break;
            } else if (arr[1] == null) {
                arr[1] = item;
                break;
            } else if (arr[2] == null) {
                arr[2] = item;
                break;
            } else if (arr[3] == null) {
                arr[3] = item;
                break;
            } else if (arr[4] == null) {
                arr[4] = item;
                break;
            } else if (arr[5] == null) {
                arr[5] = item;
                break;
            } else if (arr[6] == null) {
                arr[6] = item;
                break;
            } else if (arr[7] == null) {
                arr[7] = item;
                break;
            } else if (arr[8] == null) {
                arr[8] = item;
                break;
            } else if (arr[9] == null) {
                arr[9] = item;
                break;
            }
        }
    }


    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                arr[i] = null;}
                if (arr[0]==null){
                    String fin=arr[0];
                    for (int j = 0; j < arr.length-1; j++) {
                        arr[j] = arr[j+1];
                    }
                    arr[arr.length-1]=fin;
                }
            }
        }


    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {

            String x = ("Grocery List: " + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + ", " + arr[5] + ", " + arr[6] + ", " + arr[7] + ", " + arr[8] + ", " + arr[9]);
            String sub = (x.substring(0, x.indexOf(", null")));
            return sub;
    }
}