package Relacionamento;

import java.util.ArrayList;

public class DicionarioDeIp {

    ArrayList<Site> listaSites = new ArrayList<Site>();

    public static void main(String[] args) {

        Site site1 = new Site("Google", "google.com", true);
        Site site2 = new Site("Twitter", "twitter.com", false);
        Site site3 = new Site("Instagram", "insta.com", true);
        Site site4 = new Site("Facebook", "facebook.com", false);

        DicionarioDeIp ips = new DicionarioDeIp();
        ips.inserirSite(site1);
        ips.inserirSite(site2);
        ips.inserirSite(site3);
        ips.inserirSite(site4);

        System.out.println(ips.toString());
    }

    public void inserirSite(Site sites){
        listaSites.add(sites);
    }

    public String acessarSite(Site listaSite){
        if (listaSite.getStatus() == false) {
            return "Site bloqueado";
        } else {
            return "Acesso liberado";
        }
    }

    @Override
    public String toString() {
        return "DicionarioDeIp " + listaSites;
    }
}
