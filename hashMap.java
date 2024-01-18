class App
  {
    class Person
      {
      private  int id;
       private String  name;

        Person(int id,String name)
        {

          this.id = id;
          this.name = name;
          
        }
        String toString()
        {
          return id + " " + name;
          
        }
      }

    public static void main(String,args[])
    {
Map<String,Integer> mp = new HashMap<>();

      mp.put("one",1);
      mp.put("two",2);
      mp.put("three",3);
      mp.put("four",4);

      for(String key : mp.keySet())
        {System.out.println("key : " +key + " value : " + mp.get(key));
        }

      Map<String,Integer> mp1 = new LinkedHashMap<>();

      mp1.put("one",1);
      mp1.put("two",2);
      mp1.put("three",3);
      mp1.put("four",4);

      for(String key : mp1.keySet())
        {System.out.println("key : " +key + " value : " + mp1.get(key));
        }

      Set<String> s1  = new LinkedHashSet<>();
      s1.add("Agni");
      s1.add("Charan");
      s1.add("Teja");
      System.out.println(s1);


      Person p1 = new Person(0,"Agni");
      Person p2 = new Person(1,"Charan");
      Person p3 = new Person(2,"Teja");
      Person p4 = new Person(3,"Sai");
      Person p5 = new Person(4,"Arun");
 
HashMap<Person,Integer> pMap  = new LinkedHashMap<>();
      pMap.put(p1,0);
      pMap.put(p2,1);
      pMap.put(p3,2);
      pMap.put(p4,3);
      pMap.put(p5,4);

      for(Person key : pMap.setKey())
        {
System.out.println("key : " + key + " value : " + pMap.get(key));
          
          
        }
      
      

      
        
      
    }
  }
