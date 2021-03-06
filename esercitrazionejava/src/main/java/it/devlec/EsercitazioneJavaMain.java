package it.devlec;

import it.devlec.csv.EsempioCSV;
import it.devlec.log.EsempioLog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EsercitazioneJavaMain {
    private static final Logger logger =  LogManager.getLogger(EsercitazioneJavaMain.class);
    public static void main(String[] args){
        logger.trace("Hello from Log4j 2");
        logger.debug("Hello from Log4j 2");
        logger.info("Hello from Log4j 2");
        logger.warn("Hello from Log4j 2");
        logger.error("Hello from Log4j 2");
        logger.fatal("Hello from Log4j 2");
        EsempioLog esempioLog = new EsempioLog();
        esempioLog.stampaAltriLog();
        EsempioCSV esempioCSV = new EsempioCSV();
        esempioCSV.leggiCSV();
        esempioCSV.scriviCSV();
    }
}
