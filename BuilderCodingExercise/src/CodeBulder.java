import java.util.ArrayList;

class CodeElement {
    String name, type;
    public ArrayList<String> elements = new ArrayList<>();
    private final String newLine = System.lineSeparator();

    public CodeElement() {
    }

    public CodeElement(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String toStringImpl() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class " + name).append(newLine)
                .append("{").append(newLine);

        for (String e : elements) {
            sb.append("  " + e).append(newLine);
        }
        sb.append("}").append(newLine);

        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImpl();
    }
}

class CodeBuilder {
    private String className;
    private CodeElement root = new CodeElement();

    public CodeBuilder(String className) {
        this.className = className;
        root.name = className;
    }

    public CodeBuilder addField(String childName, String childType) {
        CodeElement e = new CodeElement(childName, childType);
        root.elements.add("public " + e.type + " " + e.name + ";");
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}

class Exercise {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        System.out.println(cb);
    }
}