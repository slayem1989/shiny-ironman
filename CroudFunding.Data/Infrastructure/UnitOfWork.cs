using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CroudFunding.Data.Infrastructure;
using CroudFunding.Data.Models;
using CroudFunding.Data.Repositories;

namespace CroudFunding.Data.Infrastructure
{
    public class UnitOfWork : IUnitOfWork
    {
        private collabdbContext dataContext;
        IDatabaseFactory dbFactory;

        public UnitOfWork(IDatabaseFactory dbFactory)
        {
            this.dbFactory = dbFactory;
        }
        private IAdminRepository adminRepository;

        public IAdminRepository AdminRepository
        {
            get
            {
                return adminRepository = new AdministratorRepository(dbFactory);
            }
        }

        private IChallengeRepository challengeRepository;

        public IChallengeRepository ChallengeRepository
        {
            get
            {
                return challengeRepository = new ChallengeRepository(dbFactory);
            }
        }

        private ICommentRepository commentRepository;

        public ICommentRepository CommentRepository
        {
            get
            {
                return commentRepository = new CommentRepository(dbFactory);
            }
        }

        private IProjectsRepository projectsRepository;

        public IProjectsRepository ProjectsRepository
        {
            get
            {
                return projectsRepository = new ProjectRepository(dbFactory);
            }
        }
        private IUserRepository userRepository;

        public IUserRepository UserRepositoryy
        {
            get
            {
                return userRepository = new UserRepository(dbFactory);
            }
        }

        protected collabdbContext DataContext
        {
            get
            {
                return dataContext = dbFactory.DataContext;
            }
        }

        public void Commit()
        {
            DataContext.SaveChanges();
        }

        public void Dispose()
        {
            dbFactory.Dispose();
        }



        public IUserRepository UserRepository
        {
            get { throw new NotImplementedException(); }
        }
    }
}