package main;

import java.io.IOException;

import Core.User;
import Helpers.FileReaderHelper;
import Helpers.FileWriterHelper;
import Helpers.MenuConsoleHelper;
import Mappers.UserMapper;

public class MenuManager {

    User user;
    FileReaderHelper fReader ;
    FileWriterHelper fWriter ;
    UserMapper userMapper;
    MenuConsoleHelper menuHelper;
    private final String fileName;

    public MenuManager(String fileName) {
        this.user = new User();
        this.fReader = new FileReaderHelper();
        this.fWriter = new FileWriterHelper();
        this.userMapper = new UserMapper();
        menuHelper = new MenuConsoleHelper();
        this.fileName = fileName;
    }

    public void StartMenue() throws IOException {
        if(fWriter.doFileExist(fileName))
        {
            CreateUserFromData();
        }
        else
        {
            AddNewUser();
            WriteUserToFile();
        }
    }

    private void CreateUserFromData() throws IOException {
        user = userMapper.mapDataToUser(fReader.ReadFromFile(fileName));
    }

    private void AddNewUser() throws IOException {
        user = menuHelper.IniciateUser();
    }

    private void WriteUserToFile() throws IOException {
        fWriter.writDataToFile("UserData.txt",userMapper.mapUserToData(user));
    }


}
