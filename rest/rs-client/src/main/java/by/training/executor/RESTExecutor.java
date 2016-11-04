package by.training.executor;

import static by.training.parser.JAXBParser.objectToXml;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import by.training.entity.LessonEntity;
import by.training.entity.TeacherEntity;

public abstract class RESTExecutor {

    private static final String     URL    = "http://localhost:4000/teachers";
    private static final HttpClient CLIENT = new HttpClient();

    public static HttpMethod createTeacher(final TeacherEntity teacher)
            throws JAXBException, HttpException, IOException {
        PostMethod method = new PostMethod(URL + "/");

        RequestEntity requestEntity = new StringRequestEntity(objectToXml(teacher),
                "application/xml", "UTF-8");
        method.setRequestEntity(requestEntity);

        printInfo(CLIENT.executeMethod(method), "Create teacher " + teacher.getId());
        return method;
    }

    public static HttpMethod updateTeacher(final TeacherEntity teacher)
            throws JAXBException, HttpException, IOException {
        PutMethod method = new PutMethod(URL + "/");

        RequestEntity requestEntity = new StringRequestEntity(objectToXml(teacher),
                "application/xml", "UTF-8");
        method.setRequestEntity(requestEntity);

        printInfo(CLIENT.executeMethod(method), "Update teacher " + teacher.getId());
        return method;
    }

    public static HttpMethod deleteTeacher(final long id)
            throws JAXBException, HttpException, IOException {
        DeleteMethod method = new DeleteMethod(URL + "/" + id);

        printInfo(CLIENT.executeMethod(method), "Delete teacher " + id);
        return method;
    }

    public static HttpMethod getTeacher(final long id) throws HttpException, IOException {
        GetMethod method = new GetMethod(URL + "/" + id);

        printInfo(CLIENT.executeMethod(method), method, "Get teacher " + id);
        return method;
    }

    public static HttpMethod getTeachers() throws HttpException, IOException {
        GetMethod method = new GetMethod(URL + "/");

        printInfo(CLIENT.executeMethod(method), method, "Get teachers");
        return method;
    }

    public static HttpMethod addLesson(final long id, final LessonEntity lesson)
            throws JAXBException, HttpException, IOException {
        PostMethod method = new PostMethod(URL + "/" + id + "/lesson");

        RequestEntity requestEntity = new StringRequestEntity(objectToXml(lesson),
                "application/xml", "UTF-8");
        method.setRequestEntity(requestEntity);

        printInfo(CLIENT.executeMethod(method), "Add lesson to teacher " + id);
        return method;
    }

    private static void printInfo(final int responseCode, final String message) throws IOException {
        System.out.println(message);
        System.out.println("Response Code: " + responseCode);
        System.out.println();
    }

    private static void printInfo(final int responseCode, final HttpMethodBase method,
            final String message) throws IOException {
        final int MAXLEN = 1000;

        System.out.println(message);
        System.out.println("Response Code: " + responseCode);
        System.out.println(method.getResponseBodyAsString(MAXLEN));
        System.out.println();
    }

}
