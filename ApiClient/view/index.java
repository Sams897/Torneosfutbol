package view;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL; 
import java.util.List;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import model.Person;
import model.BinaryTree;
import model.OpenAddressingHashTable; 

public class index
{
    public static void main(String[] args)
    {
        try
        {
            URI uri = new URI("http://localhost:8286/api/person");
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if(responseCode != 200)
            {
                throw new RuntimeException("Error: " + responseCode);
            }
            else
            {
                String result = "";
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String line;
                while ((line = reader.readLine()) != null) {
                    result += line;
                }
                reader.close();

                System.out.println(result);

                Type collectionType = new TypeToken<List<Person>>(){}.getType();
                List<Person> data =  new Gson().fromJson( result , collectionType);

                // se instancia del árbol binario
                BinaryTree binaryTree = new BinaryTree();
                // se instancia de la tabla hash
                OpenAddressingHashTable hashTable = new OpenAddressingHashTable();

                 // Se Insertar datos en el árbol binario y la tabla hash
                 for (Person item : data) {
                    binaryTree.insert(item.getId(), item);
                    hashTable.insert(item.getId(), item);
                }

                  //  aca damos el ejemplo de búsqueda en el árbol binario
                  Person personFromTree = binaryTree.search(14);
                  if (personFromTree != null) {
                      System.out.println("Persona encontrada en el árbol binario: " + personFromTree.getName());
                  } else {
                      System.out.println("Persona no encontrada en el árbol binario.");
                  }
  
                  // aca damos el ejemplo de búsqueda en la tabla hash
                  Person personFromHashTable = hashTable.search(14);
                  if (personFromHashTable != null) {
                      System.out.println("Persona encontrada en la tabla hash: " + personFromHashTable.getName());
                  } else {
                      System.out.println("Persona no encontrada en la tabla hash.");
                  }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}