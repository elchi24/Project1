package pagescraper;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class PageScraper {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Validate.isTrue(args.length == 1, "usage: supply url to fetch"); 
        String url = args[0]; 

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]"); 
        Elements media = doc.select("[src]"); 
        Elements imports = doc.select("link[href]"); 
        
    
        
        System.out.println("printing all links from " + url);
        
        
        for(Element e : links){
            System.out.println(e.attr("href"));
        }
        
        for(Element e : media){
            System.out.println(e.attr("src"));
        }
        
        for(Element e : imports){
            System.out.println(e.attr("href"));
        }
       
      
  
  


    }


}

