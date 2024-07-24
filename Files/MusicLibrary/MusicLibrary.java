import java.util.*;

class MusicLibrary
{
String libraryName;
List<Music> musics;

MusicLibrary(String name){
this.libraryName = name;
musics = new ArrayList<>();
}

void addMusic(Music music)
{
musics.add(music);
}
void deleteMusic(Music music)
{
musics.remove(music);
}
void putMusic(List<Music> m){
musics.addAll(m);
}
void playMusic(){
Random random = new Random();
int i = random.nextInt(musics.size());
System.out.println("The player is playing the song "+musics.get(i).musicName);
}

public static void main(String args[]){
Music m1= new Music("Hukum Allapara kelaparooom",4.3);
Music m2 = new Music("Thee Thalapathy",3.2);
Music m3 = new Music("Oothugada sangu",4.0);
Music m4 = new Music("Jailer theme", 3.6);
MusicLibrary library = new MusicLibrary("MySongs");
library.addMusic(m1);
library.addMusic(m2);
library.addMusic(m3);
library.addMusic(m4);
library.playMusic();
}
}

class Music
{
String musicName;
double duration;
Music(String musicName,double duration)
{
this.musicName = musicName;
this.duration = duration;
}
}
