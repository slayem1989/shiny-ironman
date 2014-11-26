using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CroudFunding.Domain.Entities;
using CroudFunding.Service;
using System.Collections;



namespace TestApplication
{
    class Program
    {
        static void Main(string[] args) 
        {

            //Create Project
            //**************
            //**************
          /* project projectslim2=new project();
            EBuyService pro = new EBuyService();
            
            projectslim2.nameProject = "slim";
            projectslim2.typeProject = "test";
            pro.CreateProject(projectslim2);
            Console.Write("insered");
          
            
            */
            
            //Find Project by Name
            //*****************
            //*****************
            EBuyService searchService = new EBuyService();

            
            /*List<project> list;
            list = searchService.GetprojectByName("slim").ToList();
            foreach (var item in list)
            {
                Console.WriteLine(item.ownerProject);
            }
            */
            //Lister tous les projets 
            /*List<project> listedeprojet;
            listedeprojet = searchService.GetAllProject().ToList();
            foreach (var item in listedeprojet)
            {
                Console.WriteLine(item.nameProject);
            }
        */
            //Fin Project by type Name 
            List<project> lst;
            lst = searchService.GetprojectbyTypeName("slim", "test").ToList();
            foreach (var item in lst)
            {
                Console.WriteLine(item.nameProject);
            }
            
         
            Console.Read();
          
    


            


        }
    }
}
