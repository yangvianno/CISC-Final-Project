package edu.sdccd.cisc191;
import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 */
public class IOLab {

    public static String readTestResults(String s) {
        File file = new File("/Users/alexvo/Desktop/IdeaProjects/IO Streams/src/main/resources/" + s);
        Scanner input = null;
        String line = "";

        try {
            input = new Scanner(file, "UTF-8");
            while (input.hasNext()) {
                line = line + input.next();
            }
            input.close();
        }
        catch (FileNotFoundException exception) {
        }
        return line;
    }

    public static void appendTestResult(String s, String s1) {
        try {
            File fileAppend = new File("/Users/alexvo/Desktop/IdeaProjects/IO Streams/src/main/resources/" + s);
            FileWriter fileWriter = new FileWriter(fileAppend, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(s1);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readDateTime(String s) {
        URL url;
        String line = "";
        String outLine = "";
        try {
            url = new URL(s);
            URLConnection connection = url.openConnection();
            InputStream urlData = connection.getInputStream();
            BufferedReader in;
            in = new BufferedReader(new InputStreamReader(urlData));
            line = in.readLine();
            String str = "\"datetime\":\"";
            int strIndex = line.indexOf(str);
            outLine = line.substring(strIndex + str.length(), line.indexOf("\",\"day_of_week"));
            in.close();
        } catch (MalformedURLException exception) {
            System.out.println("Error: MalformedURLException");
        } catch (IOException exception) {
            System.out.println("Error: IOException");
        }
        return outLine;
    }
}

