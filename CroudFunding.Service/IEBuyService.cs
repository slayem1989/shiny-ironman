﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CroudFunding.Domain.Entities;

namespace CroudFunding.Service
{
    public interface IEBuyService:IDisposable
    {
        void CreateChallenge(challenge ch);
        void UpdateChallenge(challenge ch);
        void DeleteChallenge(Int16 id);
        challenge GetChallenge(Int16 id);
        IEnumerable<challenge> GetAllChalleng();
        void CreateComment(comment com);
        void UpdateComment(comment com);
        void DeleteComment(comment com);
        challenge GetComment(Int16 id);
        IEnumerable<comment> GetAllComment();
        void CreateDonation(donation don);
        void UpdateDonation(donation don);
        void DeleteDonation(Int16 id);
        challenge GetDonation(Int16 id);
        IEnumerable<donation> GetAllDonation();
        void CreateForum(forum f);
        void UpdateForum(forum f);
        void DeleteForum(Int16 id);
        challenge GetForum(Int16 id);
        IEnumerable<forum> GetAllForum();
        void CreateInvestor(investor i);
        void CreateParticipate(participate par);
        void UpdateParticipate(participate par);
        void DeleteParticipate(Int16 id);
        challenge GetParticipate(Int16 id);
        IEnumerable<participate> GetAllParticipate();
        void CreateProject(project pro);
        void UpdateProject(project pro);
        void DeleteProject(Int16 id);
        challenge GetProject(Int16 id);
        IEnumerable<project> GetAllProject();
        void CreateRating(rating rat);
        void UpdateRating(rating rat);
        void DeleteRating(Int16 id);
        challenge GetRating(Int16 id);
        IEnumerable<rating> GetAllRating();
        void CreateUser(user u);
        void UpdateUsers(user u);
        void DeleteUsers(Int16 id);
        challenge GetUsers(Int16 id);
        IEnumerable<user> GetAllUsers();
        void CreateWinner(winner w);
     

    }
}
