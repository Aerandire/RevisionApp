package edu.sg.nus.iss.RevisionApp.services;

import org.springframework.stereotype.Service;

@Service
public class numberService {
    public String checkNum(String aNumber){
        
        if(aNumber.length() > 8 || aNumber.length() < 7){
            return null;
        }else if(aNumber.length() == 7){
            String num = aNumber.substring(aNumber.length() - 1);
            int realNum = Integer.parseInt(num);
            if(realNum >= 0 || realNum <=10){
                return aNumber;
            }else{
                return null;
            }
        }else if(aNumber.length() == 8){
            String num = aNumber.substring(aNumber.length() - 2);
            int realNum = Integer.parseInt(num);
            if(realNum >= 10 || realNum <=30){
                return aNumber;
            }else{
                return null;
            }
        }
            
        return aNumber;
        
    }
}
