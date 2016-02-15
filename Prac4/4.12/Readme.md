
4.12 Time Updater in Servlet
----------------------------
In this program we are going to make one program on servlet which will keep on updating the time in every second and the result will be displayed to you.
To make this servlet firstly we need to make a class named TimeUpdater.  The name of the class should be such that it becomes easy to understand what the program is going to do. Call the method getWriter() method of the response object which will return a PrintWriter object. Use the method getHeader() of the response object to add a new header. We can also use setHeader() in place of getHeader(). The setHeader() method overrides the previous set header. Now by using the PrintWriter object display the result on the browser.

![compile](https://cloud.githubusercontent.com/assets/16933575/13041871/4458114c-d3e1-11e5-8177-a3fe58c2ae14.JPG)
![time1](https://cloud.githubusercontent.com/assets/16933575/13041872/4462a6b6-d3e1-11e5-82e4-50e2f4d08ce1.JPG)
![time2](https://cloud.githubusercontent.com/assets/16933575/13041873/44f3c0ba-d3e1-11e5-95d4-0f70df359fab.JPG)

