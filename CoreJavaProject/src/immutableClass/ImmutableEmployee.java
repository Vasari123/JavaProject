package immutableClass;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableEmployee {


    private final int employeeId;
    private final String name;
    private final Map<String, String> attributes; // Example of a mutable field

    public ImmutableEmployee(int employeeId, String name, Map<String, String> attributes) {
        this.employeeId = employeeId;
        this.name = name;
        if (attributes != null){
            this.attributes = new HashMap<>(attributes);
        }
        else {
            this.attributes = new HashMap<>();
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }

    public static void main(String[] args) {
        Map<String, String> initialAttributes = new HashMap<>();
        initialAttributes.put("department", "IT");
        initialAttributes.put("role", "Developer");

        ImmutableEmployee employee = new ImmutableEmployee(101, "Alice", initialAttributes);
        System.out.println("Initial Employee: " + employee);

        // Attempting to modify the original map passed to the constructor
        initialAttributes.put("location", "New York");
        System.out.println("Employee after modifying original map: " + employee); // No change in employee's attributes

        // Attempting to modify the map obtained from the getter
        Map<String, String> retrievedAttributes = employee.getAttributes();
        try {
            retrievedAttributes.put("salary", "80000"); // This will throw an UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify retrieved attributes: " + e.getMessage());
        }
        System.out.println("Employee after attempting to modify retrieved attributes: " + employee); // No change
    }
}

