using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CroudFunding.Data.Infrastructure;
using CroudFunding.Data.Repositories;
using CroudFunding.Domain.Entities;
using System.Data.SqlClient;
using CroudFunding.Data.Models;
using System.Data;
using System.Configuration;
using System.Collections;



namespace CroudFunding.Service
{
    public class EBuyService : IEBuyService
    {
        static DatabaseFactory dbFactory = new DatabaseFactory();
        IUnitOfWork utOfWork = new UnitOfWork(dbFactory);
        public EBuyService()
        {

        }
        public void CreateChallenge(challenge ch)
        {
            throw new NotImplementedException();
        }

        public void UpdateChallenge(challenge ch)
        {
            throw new NotImplementedException();
        }

        public void DeleteChallenge(short id)
        {
            throw new NotImplementedException();
        }

        public challenge GetChallenge(short id)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<challenge> GetAllChalleng()
        {
            throw new NotImplementedException();
        }

        public void CreateComment(comment com)
        {
            utOfWork.CommentRepository.Add(com);
            utOfWork.Commit();
        }

        public void UpdateComment(comment com)
        {
            utOfWork.CommentRepository.Update(com);
            utOfWork.Commit();
        }

        public void DeleteComment(comment com)
        {
            utOfWork.CommentRepository.Delete(com);
            utOfWork.Commit();
        }

        public comment GetComment(int id)
        {
            var Comment = utOfWork.CommentRepository.GetById(id);
            return Comment;
        }

        public IEnumerable<comment> GetAllComment()
        {
            var comments = utOfWork.CommentRepository.GetAll();
            return comments;
        }

        public void CreateDonation(donation don)
        {
            throw new NotImplementedException();
        }

        public void UpdateDonation(Domain.Entities.donation don)
        {
            throw new NotImplementedException();
        }

        public void DeleteDonation(short id)
        {
            throw new NotImplementedException();
        }

        public donation GetDonation(short id)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Domain.Entities.donation> GetAllDonation()
        {
            throw new NotImplementedException();
        }

        public void CreateForum(Domain.Entities.forum f)
        {
            throw new NotImplementedException();
        }

        public void UpdateForum(Domain.Entities.forum f)
        {
            throw new NotImplementedException();
        }

        public void DeleteForum(short id)
        {
            throw new NotImplementedException();
        }

        public forum GetForum(short id)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Domain.Entities.forum> GetAllForum()
        {
            throw new NotImplementedException();
        }

        public void CreateInvestor(Domain.Entities.investor i)
        {
            throw new NotImplementedException();
        }

        public void CreateParticipate(Domain.Entities.participate par)
        {
            throw new NotImplementedException();
        }

        public void UpdateParticipate(Domain.Entities.participate par)
        {
            throw new NotImplementedException();
        }

        public void DeleteParticipate(short id)
        {
            throw new NotImplementedException();
        }

        public participate GetParticipate(short id)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Domain.Entities.participate> GetAllParticipate()
        {
            throw new NotImplementedException();
        }

        public void CreateProject(Domain.Entities.project pro)
        {
            utOfWork.ProjectsRepository.Add(pro);
            utOfWork.Commit();
        }

        public void UpdateProject(Domain.Entities.project pro)
        {
            utOfWork.ProjectsRepository.Update(pro);
            utOfWork.Commit();
        }

        public void DeleteProject(short id)
        {
            var pr = utOfWork.ProjectsRepository.GetById(id);
            utOfWork.ProjectsRepository.Delete(pr);
            utOfWork.Commit();

        }

        public project GetProject(short id)
        {
            var pro = utOfWork.ProjectsRepository.GetById(id);
            return pro;
        }

        public IEnumerable<Domain.Entities.project> GetAllProject()
        {
            var pros = utOfWork.ProjectsRepository.GetAll();
            return pros;
        }

        public IEnumerable<Domain.Entities.project> GetprojectByName(string NameProject)
        {

            var projectsList = utOfWork.ProjectsRepository.GetMany(x => x.nameProject == NameProject);

            return projectsList;
        }




        public void CreateRating(Domain.Entities.rating rat)
        {
            throw new NotImplementedException();
        }

        public void UpdateRating(Domain.Entities.rating rat)
        {
            throw new NotImplementedException();
        }

        public void DeleteRating(short id)
        {
            throw new NotImplementedException();
        }

        public rating GetRating(short id)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Domain.Entities.rating> GetAllRating()
        {
            throw new NotImplementedException();
        }

        public void CreateUser(Domain.Entities.user u)
        {
            throw new NotImplementedException();
        }

        public void UpdateUsers(Domain.Entities.user u)
        {
            throw new NotImplementedException();
        }

        public void DeleteUsers(short id)
        {
            throw new NotImplementedException();
        }

        public user GetUsers(short id)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Domain.Entities.user> GetAllUsers()
        {
            throw new NotImplementedException();
        }

        public void CreateWinner(Domain.Entities.winner w)
        {
            throw new NotImplementedException();
        }

        public void Dispose()
        {
            throw new NotImplementedException();
        }

        public IEnumerable<project> GetprojectbyTypeName(string NameProject, string TypeProject)
        {
            var projectsList = utOfWork.ProjectsRepository.GetMany(x => x.nameProject == NameProject && x.typeProject == TypeProject);

            return projectsList;
        }
    }
}

