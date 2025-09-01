

## الفهرس
1. [Control Statements](#control-statements)
2. [Selection Statements](#selection-statements)
3. [Built-in Functions للإدخال والإخراج](#built-in-functions)
4. [أنواع إدخال البيانات](#input-types)
5. [Repetition Statements](#repetition-statements)

---

## Control Statements

Control Statements هي العبارات التي تتحكم في تدفق تنفيذ البرنامج. تنقسم إلى ثلاثة أنواع رئيسية:

### 1. Sequential Control
- التنفيذ المتتالي للعبارات من أعلى لأسفل
- هو السلوك الافتراضي للبرنامج

```java
System.out.println("السطر الأول");
System.out.println("السطر الثاني");
System.out.println("السطر الثالث");
```

### 2. Selection Control
- اختيار مسار التنفيذ بناءً على شروط معينة
- يشمل: if, if-else, switch

### 3. Iteration Control
- تكرار تنفيذ مجموعة من العبارات
- يشمل: for, while, do-while

---

## Selection Statements

### 1. if Statement

#### الصيغة الأساسية:
```java
if (condition) {
    // كود ينفذ إذا كان الشرط صحيح
}
```

#### مثال:
```java
public class IfExample {
    public static void main(String[] args) {
        int age = 18;
        
        if (age >= 18) {
            System.out.println("أنت بالغ");
        }
    }
}
```

### 2. if-else Statement

#### الصيغة:
```java
if (condition) {
    // كود ينفذ إذا كان الشرط صحيح
} else {
    // كود ينفذ إذا كان الشرط خاطئ
}
```

#### مثال:
```java
public class IfElseExample {
    public static void main(String[] args) {
        int number = -5;
        
        if (number > 0) {
            System.out.println("الرقم موجب");
        } else {
            System.out.println("الرقم سالب أو صفر");
        }
    }
}
```

### 3. if-else if-else (Ladder)

#### الصيغة:
```java
if (condition1) {
    // كود للشرط الأول
} else if (condition2) {
    // كود للشرط الثاني
} else if (condition3) {
    // كود للشرط الثالث
} else {
    // كود افتراضي
}
```

#### مثال:
```java
public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        
        if (score >= 90) {
            System.out.println("ممتاز");
        } else if (score >= 80) {
            System.out.println("جيد جداً");
        } else if (score >= 70) {
            System.out.println("جيد");
        } else if (score >= 60) {
            System.out.println("مقبول");
        } else {
            System.out.println("راسب");
        }
    }
}
```

### 4. Nested if Statements

#### مثال:
```java
public class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;
        
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("يمكنك قيادة السيارة");
            } else {
                System.out.println("تحتاج لرخصة قيادة");
            }
        } else {
            System.out.println("أنت صغير على القيادة");
        }
    }
}
```

### 5. switch Statement

#### الصيغة:
```java
switch (variable) {
    case value1:
        // كود للقيمة الأولى
        break;
    case value2:
        // كود للقيمة الثانية
        break;
    default:
        // كود افتراضي
        break;
}
```

#### مثال - أيام الأسبوع:
```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        
        switch (day) {
            case 1:
                System.out.println("الأحد");
                break;
            case 2:
                System.out.println("الاثنين");
                break;
            case 3:
                System.out.println("الثلاثاء");
                break;
            case 4:
                System.out.println("الأربعاء");
                break;
            case 5:
                System.out.println("الخميس");
                break;
            case 6:
                System.out.println("الجمعة");
                break;
            case 7:
                System.out.println("السبت");
                break;
            default:
                System.out.println("يوم غير صحيح");
                break;
        }
    }
}
```

#### مثال - switch مع String:
```java
public class SwitchStringExample {
    public static void main(String[] args) {
        String grade = "A";
        
        switch (grade) {
            case "A":
                System.out.println("ممتاز - 90-100");
                break;
            case "B":
                System.out.println("جيد جداً - 80-89");
                break;
            case "C":
                System.out.println("جيد - 70-79");
                break;
            case "D":
                System.out.println("مقبول - 60-69");
                break;
            case "F":
                System.out.println("راسب - أقل من 60");
                break;
            default:
                System.out.println("درجة غير صحيحة");
                break;
        }
    }
}
```

### 6. Ternary Operator (? :)

#### الصيغة:
```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

#### مثال:
```java
public class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        int max = (a > b) ? a : b;
        System.out.println("الأكبر هو: " + max);
        
        String message = (a % 2 == 0) ? "زوجي" : "فردي";
        System.out.println("الرقم " + a + " هو " + message);
    }
}
```

---

## Built-in Functions للإدخال والإخراج

### 1. System.out Functions (الإخراج)

#### System.out.print()
- يطبع النص بدون إنتقال لسطر جديد

```java
public class PrintExample {
    public static void main(String[] args) {
        System.out.print("مرحبا ");
        System.out.print("بك ");
        System.out.print("في Java");
        // النتيجة: مرحبا بك في Java
    }
}
```

#### System.out.println()
- يطبع النص مع الانتقال لسطر جديد

```java
public class PrintlnExample {
    public static void main(String[] args) {
        System.out.println("السطر الأول");
        System.out.println("السطر الثاني");
        System.out.println("السطر الثالث");
    }
}
```

#### System.out.printf() (Formatted Output)
- يطبع النص مع تنسيق محدد

```java
public class PrintfExample {
    public static void main(String[] args) {
        String name = "أحمد";
        int age = 25;
        double salary = 5000.75;
        
        System.out.printf("الاسم: %s, العمر: %d, الراتب: %.2f%n", name, age, salary);
        System.out.printf("النسبة: %d%%%n", 85); // طباعة علامة %
        
        // تنسيق الأرقام
        System.out.printf("رقم بـ 5 خانات: %5d%n", 123);
        System.out.printf("رقم عشري بـ 3 خانات: %.3f%n", 3.14159);
    }
}
```

##### Format Specifiers مهمة:
- `%s` - String
- `%d` - Integer
- `%f` - Float/Double
- `%c` - Character
- `%b` - Boolean
- `%n` - New line
- `%%` - علامة %

### 2. Scanner Class (الإدخال)

#### إنشاء Scanner Object:
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

#### أهم Methods في Scanner:

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // قراءة نص كامل
        System.out.print("اكتب اسمك: ");
        String name = input.nextLine();
        
        // قراءة رقم صحيح
        System.out.print("اكتب عمرك: ");
        int age = input.nextInt();
        
        // قراءة رقم عشري
        System.out.print("اكتب راتبك: ");
        double salary = input.nextDouble();
        
        // قراءة كلمة واحدة
        System.out.print("اكتب مدينتك: ");
        String city = input.next();
        
        // قراءة حرف
        System.out.print("اكتب أول حرف من اسمك: ");
        char firstChar = input.next().charAt(0);
        
        // قراءة boolean
        System.out.print("هل أنت طالب؟ (true/false): ");
        boolean isStudent = input.nextBoolean();
        
        // طباعة النتائج
        System.out.println("\n=== معلوماتك ===");
        System.out.println("الاسم: " + name);
        System.out.println("العمر: " + age);
        System.out.println("الراتب: " + salary);
        System.out.println("المدينة: " + city);
        System.out.println("أول حرف: " + firstChar);
        System.out.println("طالب: " + isStudent);
        
        input.close(); // إغلاق Scanner
    }
}
```

#### مشكلة nextLine() بعد nextInt():
```java
import java.util.Scanner;

public class NextLineProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("اكتب رقم: ");
        int number = input.nextInt();
        
        // هذا السطر مهم لحل المشكلة
        input.nextLine(); // يستهلك الـ newline character
        
        System.out.print("اكتب اسمك: ");
        String name = input.nextLine();
        
        System.out.println("الرقم: " + number);
        System.out.println("الاسم: " + name);
        
        input.close();
    }
}
```

---

## أنواع إدخال البيانات (Input Types)

### 1. إدخال من المستخدم (Console Input)

```java
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("أدخل اسمك: ");
        String name = scanner.nextLine();
        
        System.out.print("أدخل عمرك: ");
        int age = scanner.nextInt();
        
        System.out.printf("مرحباً %s، عمرك %d سنة%n", name, age);
        
        scanner.close();
    }
}
```

### 2. إدخال من ملف خارجي (File Input)

#### قراءة من ملف نصي:
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner fileScanner = new Scanner(file);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println("من الملف: " + line);
            }
            
            fileScanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("الملف غير موجود: " + e.getMessage());
        }
    }
}
```

#### قراءة أرقام من ملف:
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumbersFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner fileScanner = new Scanner(file);
            
            int sum = 0;
            int count = 0;
            
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                sum += number;
                count++;
                System.out.println("رقم: " + number);
            }
            
            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("المجموع: " + sum);
                System.out.println("المتوسط: " + average);
            }
            
            fileScanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("خطأ في قراءة الملف: " + e.getMessage());
        }
    }
}
```

### 3. إدخال من Command Line Arguments

```java
public class CommandLineInput {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("لم يتم إدخال أي معاملات");
            return;
        }
        
        System.out.println("عدد المعاملات: " + args.length);
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("المعامل " + (i + 1) + ": " + args[i]);
        }
        
        // تحويل المعاملات لأرقام إذا أمكن
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("المجموع: " + (num1 + num2));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("أدخل رقمين صحيحين");
        }
    }
}
```

### 4. إدخال من Environment Variables

```java
public class EnvironmentInput {
    public static void main(String[] args) {
        // قراءة متغير بيئة محدد
        String javaHome = System.getenv("JAVA_HOME");
        String userName = System.getenv("USER");
        
        System.out.println("JAVA_HOME: " + javaHome);
        System.out.println("USER: " + userName);
        
        // طباعة جميع متغيرات البيئة
        System.out.println("\nجميع متغيرات البيئة:");
        System.getenv().forEach((key, value) -> 
            System.out.println(key + " = " + value));
    }
}
```

### 5. إدخال من System Properties

```java
public class SystemPropertiesInput {
    public static void main(String[] args) {
        // خصائص النظام المهمة
        System.out.println("إصدار Java: " + System.getProperty("java.version"));
        System.out.println("نظام التشغيل: " + System.getProperty("os.name"));
        System.out.println("مجلد المستخدم: " + System.getProperty("user.home"));
        System.out.println("مجلد العمل: " + System.getProperty("user.dir"));
        
        // يمكن أيضاً تعيين خصائص مخصصة
        System.setProperty("myapp.version", "1.0");
        System.out.println("إصدار التطبيق: " + System.getProperty("myapp.version"));
    }
}
```

---

## مثال شامل للإدخال والإخراج

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ComprehensiveIOExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // إدخال أساسي من المستخدم
        System.out.print("أدخل اسمك: ");
        String name = console.nextLine();
        
        System.out.print("أدخل عمرك: ");
        int age = console.nextInt();
        console.nextLine(); // حل مشكلة nextLine
        
        // استخدام if-else
        if (age >= 18) {
            System.out.println("مرحباً " + name + "، أنت بالغ");
        } else {
            System.out.println("مرحباً " + name + "، أنت قاصر");
        }
        
        // استخدام switch
        System.out.print("أدخل تقديرك (A, B, C, D, F): ");
        String grade = console.nextLine().toUpperCase();
        
        switch (grade) {
            case "A":
                System.out.println("ممتاز! استمر");
                break;
            case "B":
                System.out.println("جيد جداً");
                break;
            case "C":
                System.out.println("جيد، يمكن التحسن");
                break;
            case "D":
                System.out.println("مقبول، احتاج لجهد أكثر");
                break;
            case "F":
                System.out.println("راسب، احتاج لدراسة أكثر");
                break;
            default:
                System.out.println("تقدير غير صحيح");
                break;
        }
        
        console.close();
    }
}
```

---

## Repetition Statements (عبارات التكرار)

### 1. for Loop

#### الصيغة الأساسية:
```java
for (initialization; condition; increment/decrement) {
    // كود يتكرر
}
```

#### أمثلة متنوعة:

```java
public class ForLoopExamples {
    public static void main(String[] args) {
        // مثال 1: طباعة الأرقام من 1 إلى 10
        System.out.println("الأرقام من 1 إلى 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // مثال 2: طباعة الأرقام الزوجية
        System.out.println("الأرقام الزوجية من 2 إلى 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // مثال 3: العد التنازلي
        System.out.println("العد التنازلي من 10 إلى 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // مثال 4: حساب المضروب (Factorial)
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("مضروب " + n + " = " + factorial);
        
        // مثال 5: nested for loops (جدول الضرب)
        System.out.println("\nجدول الضرب:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
```

### 2. Enhanced for Loop (for-each)

```java
public class EnhancedForLoop {
    public static void main(String[] args) {
        // مع المصفوفات
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("عناصر المصفوفة:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // مع Strings
        String[] names = {"أحمد", "فاطمة", "محمد", "عائشة"};
        
        System.out.println("\nالأسماء:");
        for (String name : names) {
            System.out.println("اسم: " + name);
        }
    }
}
```

### 3. while Loop

#### الصيغة:
```java
while (condition) {
    // كود يتكرر
}
```

#### أمثلة:

```java
import java.util.Scanner;

public class WhileLoopExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // مثال 1: العد من 1 إلى 5
        System.out.println("العد باستخدام while:");
        int i = 1;
        while (i <= 5) {
            System.out.println("الرقم: " + i);
            i++;
        }
        
        // مثال 2: إدخال كلمة مرور صحيحة
        String correctPassword = "123456";
        String enteredPassword;
        
        System.out.println("\nأدخل كلمة المرور:");
        do {
            System.out.print("كلمة المرور: ");
            enteredPassword = input.nextLine();
            
            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("كلمة مرور خاطئة، حاول مرة أخرى");
            }
        } while (!enteredPassword.equals(correctPassword));
        
        System.out.println("تم الدخول بنجاح!");
        
        // مثال 3: حساب مجموع الأرقام حتى يدخل المستخدم 0
        int sum = 0;
        int number;
        
        System.out.println("\nأدخل أرقام للجمع (0 للإنهاء):");
        while (true) {
            System.out.print("رقم: ");
            number = input.nextInt();
            
            if (number == 0) {
                break; // الخروج من الحلقة
            }
            
            sum += number;
            System.out.println("المجموع الحالي: " + sum);
        }
        
        System.out.println("المجموع النهائي: " + sum);
        
        input.close();
    }
}
```

### 4. do-while Loop

#### الصيغة:
```java
do {
    // كود يتكرر
} while (condition);
```

#### أمثلة:

```java
import java.util.Scanner;

public class DoWhileExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // مثال 1: قائمة بسيطة
        int choice;
        
        do {
            System.out.println("\n=== القائمة الرئيسية ===");
            System.out.println("1. خيار أول");
            System.out.println("2. خيار ثاني");
            System.out.println("3. خيار ثالث");
            System.out.println("0. خروج");
            System.out.print("اختر: ");
            
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("اخترت الخيار الأول");
                    break;
                case 2:
                    System.out.println("اخترت الخيار الثاني");
                    break;
                case 3:
                    System.out.println("اخترت الخيار الثالث");
                    break;
                case 0:
                    System.out.println("وداعاً!");
                    break;
                default:
                    System.out.println("خيار غير صحيح");
                    break;
            }
            
        } while (choice != 0);
        
        // مثال 2: تخمين رقم
        int secretNumber = 42;
        int guess;
        int attempts = 0;
        
        System.out.println("\nلعبة تخمين الرقم!");
        System.out.println("خمن رقم بين 1 و 100");
        
        do {
            System.out.print("تخمينك: ");
            guess = input.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("الرقم أكبر!");
            } else if (guess > secretNumber) {
                System.out.println("الرقم أصغر!");
            } else {
                System.out.println("مبروك! خمنت الرقم في " + attempts + " محاولة");
            }
            
        } while (guess != secretNumber);
        
        input.close();
    }
}
```

### 5. Loop Control Statements

#### break Statement:
```java
public class BreakExample {
    public static void main(String[] args) {
        // البحث عن رقم معين
        int[] numbers = {5, 10, 15, 20, 25, 30};
        int target = 20;
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("وجدت الرقم " + target + " في الموضع " + i);
                found = true;
                break; // الخروج من الحلقة
            }
        }
        
        if (!found) {
            System.out.println("لم أجد الرقم " + target);
        }
    }
}
```

#### continue Statement:
```java
public class ContinueExample {
    public static void main(String[] args) {
        // طباعة الأرقام الفردية فقط
        System.out.println("الأرقام الفردية من 1 إلى 10:");
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // تخطي الرقم الزوجي
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // تخطي الأرقام السالبة
        int[] mixedNumbers = {-3, 5, -1, 8, -7, 12};
        System.out.println("\nالأرقام الموجبة فقط:");
        
        for (int num : mixedNumbers) {
            if (num < 0) {
                continue; // تخطي الأرقام السالبة
            }
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

---

## مشروع شامل - نظام إدارة الطلاب

```java
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // بيانات الطلاب (محاكاة قاعدة بيانات)
        String[] studentNames = new String[10];
        int[] studentAges = new int[10];
        double[] studentGrades = new double[10];
        int studentCount = 0;
        
        int choice;
        
        do {
            // عرض القائمة
            System.out.println("\n" + "=".repeat(30));
            System.out.println("   نظام إدارة الطلاب");
            System.out.println("=".repeat(30));
            System.out.println("1. إضافة طالب جديد");
            System.out.println("2. عرض جميع الطلاب");
            System.out.println("3. البحث عن طالب");
            System.out.println("4. حساب متوسط الدرجات");
            System.out.println("5. عرض أفضل طالب");
            System.out.println("0. خروج");
            System.out.print("اختيارك: ");
            
            choice = input.nextInt();
            input.nextLine(); // حل مشكلة nextLine
            
            switch (choice) {
                case 1:
                    // إضافة طالب جديد
                    if (studentCount < studentNames.length) {
                        System.out.print("اسم الطالب: ");
                        String name = input.nextLine();
                        
                        System.out.print("عمر الطالب: ");
                        int age = input.nextInt();
                        
                        System.out.print("درجة الطالب: ");
                        double grade = input.nextDouble();
                        
                        // التحقق من صحة البيانات
                        if (age > 0 && grade >= 0 && grade <= 100) {
                            studentNames[studentCount] = name;
                            studentAges[studentCount] = age;
                            studentGrades[studentCount] = grade;
                            studentCount++;
                            
                            System.out.println("تم إضافة الطالب بنجاح!");
                        } else {
                            System.out.println("بيانات غير صحيحة!");
                        }
                    } else {
                        System.out.println("لا يمكن إضافة المزيد من الطلاب!");
                    }
                    break;
                    
                case 2:
                    // عرض جميع الطلاب
                    if (studentCount == 0) {
                        System.out.println("لا يوجد طلاب مسجلين");
                    } else {
                        System.out.println("\n" + "=".repeat(50));
                        System.out.printf("%-20s %-10s %-10s %-15s%n", 
                            "الاسم", "العمر", "الدرجة", "التقدير");
                        System.out.println("=".repeat(50));
                        
                        for (int i = 0; i < studentCount; i++) {
                            String letterGrade = getLetterGrade(studentGrades[i]);
                            System.out.printf("%-20s %-10d %-10.2f %-15s%n",
                                studentNames[i], studentAges[i], 
                                studentGrades[i], letterGrade);
                        }
                    }
                    break;
                    
                case 3:
                    // البحث عن طالب
                    if (studentCount == 0) {
                        System.out.println("لا يوجد طلاب للبحث فيهم");
                        break;
                    }
                    
                    System.out.print("اكتب اسم الطالب للبحث: ");
                    String searchName = input.nextLine();
                    boolean found = false;
                    
                    for (int i = 0; i < studentCount; i++) {
                        if (studentNames[i].toLowerCase().contains(searchName.toLowerCase())) {
                            if (!found) {
                                System.out.println("\nنتائج البحث:");
                                System.out.println("=".repeat(40));
                                found = true;
                            }
                            System.out.printf("الاسم: %s, العمر: %d, الدرجة: %.2f, التقدير: %s%n",
                                studentNames[i], studentAges[i], 
                                studentGrades[i], getLetterGrade(studentGrades[i]));
                        }
                    }
                    
                    if (!found) {
                        System.out.println("لم يتم العثور على الطالب");
                    }
                    break;
                    
                case 4:
                    // حساب متوسط الدرجات
                    if (studentCount == 0) {
                        System.out.println("لا يوجد طلاب لحساب المتوسط");
                    } else {
                        double sum = 0;
                        for (int i = 0; i < studentCount; i++) {
                            sum += studentGrades[i];
                        }
                        double average = sum / studentCount;
                        
                        System.out.printf("متوسط درجات الطلاب: %.2f%n", average);
                        System.out.println("التقدير العام: " + getLetterGrade(average));
                        
                        // إحصائيات إضافية
                        int passedCount = 0;
                        for (int i = 0; i < studentCount; i++) {
                            if (studentGrades[i] >= 60) {
                                passedCount++;
                            }
                        }
                        
                        System.out.printf("عدد الناجحين: %d من %d%n", passedCount, studentCount);
                        System.out.printf("نسبة النجاح: %.1f%%%n", 
                            (double) passedCount / studentCount * 100);
                    }
                    break;
                    
                case 5:
                    // عرض أفضل طالب
                    if (studentCount == 0) {
                        System.out.println("لا يوجد طلاب");
                    } else {
                        double maxGrade = studentGrades[0];
                        int bestStudentIndex = 0;
                        
                        for (int i = 1; i < studentCount; i++) {
                            if (studentGrades[i] > maxGrade) {
                                maxGrade = studentGrades[i];
                                bestStudentIndex = i;
                            }
                        }
                        
                        System.out.println("\n🏆 أفضل طالب:");
                        System.out.println("=".repeat(30));
                        System.out.println("الاسم: " + studentNames[bestStudentIndex]);
                        System.out.println("العمر: " + studentAges[bestStudentIndex]);
                        System.out.println("الدرجة: " + studentGrades[bestStudentIndex]);
                        System.out.println("التقدير: " + getLetterGrade(maxGrade));
                    }
                    break;
                    
                case 0:
                    System.out.println("شكراً لاستخدام النظام!");
                    break;
                    
                default:
                    System.out.println("اختيار غير صحيح! اختر رقم من 0 إلى 5");
                    break;
            }
            
        } while (choice != 0);
        
        input.close();
    }
    
    // دالة لتحويل الدرجة الرقمية إلى تقدير حرفي
    public static String getLetterGrade(double grade) {
        if (grade >= 90) {
            return "A (ممتاز)";
        } else if (grade >= 80) {
            return "B (جيد جداً)";
        } else if (grade >= 70) {
            return "C (جيد)";
        } else if (grade >= 60) {
            return "D (مقبول)";
        } else {
            return "F (راسب)";
        }
    }
}
```

---

## أمثلة متقدمة للتكرار

### مثال: حساب الأعداد الأولية
```java
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("أدخل رقم للتحقق من كونه أولي: ");
        int number = input.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " هو رقم أولي");
        } else {
            System.out.println(number + " ليس رقم أولي");
        }
        
        // طباعة الأعداد الأولية حتى الرقم المدخل
        System.out.println("\nالأعداد الأولية حتى " + number + ":");
        for (int n = 2; n <= number; n++) {
            boolean isCurrentPrime = true;
            
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isCurrentPrime = false;
                    break;
                }
            }
            
            if (isCurrentPrime) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        
        input.close();
    }
}
```

### مثال: رسم أشكال بالنجوم
```java
public class StarPatterns {
    public static void main(String[] args) {
        int height = 5;
        
        System.out.println("مثلث قائم الزاوية:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nمثلث مقلوب:");
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nمثلث متساوي الأضلاع:");
        for (int i = 1; i <= height; i++) {
            // طباعة المسافات
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // طباعة النجوم
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\nمعين:");
        // النصف العلوي
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // النصف السفلي
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

---

## نصائح مهمة

### 1. أفضل الممارسات للـ Control Statements

```java
public class BestPractices {
    public static void main(String[] args) {
        // ✅ جيد: استخدم أقواس حتى لسطر واحد
        int x = 10;
        if (x > 5) {
            System.out.println("أكبر من 5");
        }
        
        // ✅ جيد: استخدم else if بدلاً من if متداخلة
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        }
        
        // ✅ جيد: استخدم switch للقيم المحددة
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("بداية الأسبوع");
                break;
            case "Friday":
                System.out.println("نهاية الأسبوع");
                break;
            default:
                System.out.println("يوم عادي");
                break;
        }
        
        // ✅ جيد: استخدم enhanced for للمصفوفات
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```

### 2. تجنب الأخطاء الشائعة

```java
import java.util.Scanner;

public class CommonMistakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // ❌ خطأ: استخدام = بدلاً من ==
        // if (x = 10) // خطأ في التركيب
        
        // ✅ صحيح:
        int x = 10;
        if (x == 10) {
            System.out.println("x يساوي 10");
        }
        
        // ❌ خطأ: نسيان break في switch
        int choice = 1;
        System.out.println("مع break:");
        switch (choice) {
            case 1:
                System.out.println("واحد");
                break; // مهم!
            case 2:
                System.out.println("اثنان");
                break;
        }
        
        // ✅ صحيح: استخدام nextLine() بعد nextInt()
        System.out.print("أدخل رقم: ");
        int number = input.nextInt();
        input.nextLine(); // مهم جداً!
        
        System.out.print("أدخل نص: ");
        String text = input.nextLine();
        
        System.out.println("الرقم: " + number + ", النص: " + text);
        
        input.close();
    }
}
```

---

## خاتمة

هذا الدليل يغطي جميع جوانب Control Statements في Java بالتفصيل:

- **Selection Statements**: if, if-else, switch, ternary operator
- **Built-in Functions**: System.out.print/println/printf, Scanner methods
- **Input Types**: Console, File, Command Line, Environment Variables
- **Repetition Statements**: for, while, do-while, enhanced for
- **Loop Control**: break, continue
- **Best Practices**: نصائح وممارسات جيدة




---
