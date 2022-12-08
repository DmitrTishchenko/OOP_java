package praktic05.src.personal;

import praktic05.src.personal.controllers.UserController;
import praktic05.src.personal.model.FileOperation;
import praktic05.src.personal.model.FileOperationImpl;
import praktic05.src.personal.model.Repository;
import praktic05.src.personal.model.RepositoryFile;
import praktic05.src.personal.model.RepositoryFileAnother;
import praktic05.src.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        FileOperation fileOperationNew = new FileOperationImpl("usersNew.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Repository repositoryAnother = new RepositoryFileAnother(fileOperationNew);
        UserController controller = new UserController(repository);
        UserController controllerAnother = new UserController(repositoryAnother);
        ViewUser view = new ViewUser(controller);
        view.run();

    }
}
