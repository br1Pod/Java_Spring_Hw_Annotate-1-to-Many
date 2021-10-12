package com.codeclan.filestructure.filestructure.components;

import com.codeclan.filestructure.filestructure.models.File;
import com.codeclan.filestructure.filestructure.models.Folder;
import com.codeclan.filestructure.filestructure.models.User;
import com.codeclan.filestructure.filestructure.repositories.FileRepository;
import com.codeclan.filestructure.filestructure.repositories.FolderRepository;
import com.codeclan.filestructure.filestructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

        public void run(ApplicationArguments args){
            User tom = new User("tom");
            userRepository.save(tom);

            User dick = new User("dick");
            userRepository.save(dick);

            User harry = new User("harry");
            userRepository.save(harry);

            Folder photos = new Folder("Photos");
            folderRepository.save(photos);

            Folder music = new Folder("Music");
            folderRepository.save(music);

            Folder videos = new Folder("Videos");
            folderRepository.save(videos);

            File landscape = new File("landscape",".png", "2.1mB");
            fileRepository.save(landscape);

            File wildlife = new File("wildlife",".jpg", "2.3mB");
            fileRepository.save(wildlife);

            File portrait = new File("portrait",".tiff", "3.5mB");
            fileRepository.save(portrait);

            File meme = new File("meme",".gif", "1.9mB");
            fileRepository.save(meme);

            File starwars = new File("starwars",".mp4", "2.2gB");
            fileRepository.save(starwars);

            File help = new File("help",".mp3", "5.2mB");
            fileRepository.save(help);


            tom.addFolders(photos);
            tom.addFolders(music);
            userRepository.save(tom);

            photos.addFile(landscape);
            photos.addFile(portrait);
            folderRepository.save(photos);

            music.addFile(help);
            folderRepository.save(music);

            videos.addFile(starwars);
            folderRepository.save(videos);
        }


    }
}
