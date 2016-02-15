
4.4 A Holistic counter in Servlet
---------------------------------
In this program we are going to make a such a servlet which will count the number of times it has been accessed and the number of threads created by the server.
In this example firstly we are going to create one class named as HolisticCounterInServlet. Now declare a variable counter of int with initial value 0, the value of this counter will be different for each servlet and create a Hashtable object. This object will be shared by all the threads in the container. Inside the doGet() method use the method getWriter() method of the response object which will return the PrintWriter object. 

![compile](https://cloud.githubusercontent.com/assets/16933575/13041634/2000be68-d3df-11e5-8d32-5be4025b40e6.JPG)
![holisticcounter](https://cloud.githubusercontent.com/assets/16933575/13041635/20334716-d3df-11e5-86bf-920eeb8a6ac2.JPG)

