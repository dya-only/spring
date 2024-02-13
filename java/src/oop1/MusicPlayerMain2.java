package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayer = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(musicPlayer);

        // 볼륨 증가
        volumeUp(musicPlayer);

        // 볼륨 감소
        volumeDown(musicPlayer);

        // 음악 플레이어 상태
        showStatus(musicPlayer);

        // 음악 플레이어 끄기
        off(musicPlayer);
    }

    static void on(MusicPlayerData musicPlayer) {
       musicPlayer.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData musicPlayer) {
        musicPlayer.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData musicPlayer) {
        musicPlayer.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayer.volume);
    }

    static void volumeDown(MusicPlayerData musicPlayer) {
        musicPlayer.volume--;
        System.out.println("음악 플레이어 볼륨: " + musicPlayer.volume);
    }

    static void showStatus(MusicPlayerData musicPlayer) {
        System.out.println("음악 플레이어 상태 확인");
        System.out.println("음악 플레이어 " + (musicPlayer.isOn ? "ON" : "OFF") + ", 볼륨: " + musicPlayer.volume);
    }
}
