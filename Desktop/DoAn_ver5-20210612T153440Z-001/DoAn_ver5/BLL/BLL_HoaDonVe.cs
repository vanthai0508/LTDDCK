using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DoAn_ver5.DTO;
using DoAn_ver5.DAL;

namespace DoAn_ver5.BLL
{
    class BLL_HoaDonVe
    {
        private static BLL_HoaDonVe _Instance;
        public static BLL_HoaDonVe Instance
        {
            get
            {
                if (_Instance == null)
                {
                    _Instance = new BLL_HoaDonVe();
                }
                return _Instance;
            }
            private set => _Instance = value;
        }
        public List<DTO_HoaDonVe> GetListHoaDonVe()
        {
            List<DTO_HoaDonVe> list = new List<DTO_HoaDonVe>();
            foreach(DataRow row in DAL_HoaDonVe.Instance.GetAllHoaDonVe().Rows)
            {
                list.Add(new DTO_HoaDonVe(row["MaHoaDonVe"].ToString(), row["MaSuatChieu"].ToString(), row["MaGhe"].ToString(), (DateTime)row["NgayBanVe"], row["MaNhanVien"].ToString(), (float)row["GiaVe"], row["MaKhachHang"].ToString());
            }
            return list;    
        }
    }
}
